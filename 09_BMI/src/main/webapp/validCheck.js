// 라이브러리      json, cos, ojdbc, ..

// 일반적으로 유효성 검사하는 것들
// 함수형태로 정리해서
// 필요할때마다 사이트에 맞춰 쓰려고 나눔.

// 문제가 있으면 true, 없으면 false

// <input> 을 넣으면..
// 거기에 글자가 없으면 true, 있으면 false
function isEmpty(input){
		return !input.value;
}


// <input>과, 글자 수 를 넣으면..
// 그 글자 수 보다 적으면 true, 아니면 false
function lessThan(input, len){
	return input.value.length < len;
}



// <input> 을 넣어서
// 값이 숫자가 아니면 true, 아니면 false

// input : 123
// input : asd

function isNotNumber(input){
		return isNaN(input.value);
}


// Test

// <input> x 2 넣으면.. (비번확인)
// 내용이 다르면 true, 같으면 false
function notEquals(input1, input2){
	return input1.value != input2.value;
}


// <input>
// 한글/특수문자 들어있으면 true, 아니면 false

// id, email   @._
function containKR(input){
	
	// 병주
	// mz세상
	// jh1004
	
	let ok = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM@._";
	
	for(let i = 0; i < input.value.length; i++){
		
		if(ok.indexOf(input.value[i]) == -1){
			return true;
		}
		
	}
	
}


// <input>, 문자열 세트 넣으면..
// 그 세트가 포함이 안되어 있으면 true

// 비밀번호   대, 숫, 소, 특


// input : ASD
// input : 1qASD

// set : 1234567890		// 숫자를 반드시 포함
// set : QWERTYUOP		// 대문자를 반드시 포함

function notContains(input, set){
	
	for(let i = 0; i < set.length; i++){
		if(input.value.indexOf(set[i]) != -1){
			return false;
		}
	}
	return true;
	
}

// <input>, 확장자를 넣으면..
// 그 파일이 아니면 true, 맞으면 false

// jpg, jpeg, png, gif	

// asd.jpg
// aaa.mp4
							// "jpg"
function isNotType(input, type){
	type = "." + type;    //   .jpg
	return	input.value.indexOf(type) == -1;
}









