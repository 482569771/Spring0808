/**
 * 
 */

var urlPaths = {
	search: '/search',
	add: '/insert',
	add2: '/submit',
	update2: '/update2',
	update: '/{date}/update(date=*{attendanceDate})',
	delete: '/deleteEmployees',
	logout: '/logout'
};


// URLパスを取得する関数
function getUrlPath(key) {
	return urlPaths[key] || '';
}

function submitForm(formId, keyName, method = undefined) {
	var form = document.getElementById(formId); // フォーム要素を取得
	form.action = getUrlPath(keyName); // フォームのaction属性にURLを設定
	if (method !== undefined) form.method = method;    // フォームのmethod属性にHTTPメソッドを設定
	form.submit(); // フォームを送信
}

function submitForm2(formId, path, method = undefined) {
	var form = document.getElementById(formId); // フォーム要素を取得
	form.action = path; // フォームのaction属性にURLを設定
	if (method !== undefined) form.method = method;    // フォームのmethod属性にHTTPメソッドを設定
	form.submit(); // フォームを送信
}

function handleUpdate(buttonElement){
	var formId = buttonElement.getAttribute("data-formid");
    var urlTemplate = buttonElement.getAttribute("data-url-template");
    var attendanceDate = buttonElement.getAttribute("data-attendance-date");
    
    var finalUrl = urlTemplate.replace("{date}", attendanceDate);
    
    // submitForm2関数を呼び出してフォームを送信します。
    submitForm2(formId, finalUrl);
}

