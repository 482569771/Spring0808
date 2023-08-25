/**
 * セレクトボックスform submit制御
 * 
 * author: Rothschilds MA
 * date: 2023/08/24
 */


function setActionAndSubmitForm(formId, urlPath, value, method=undefined) {
	const form = document.getElementById(formId);
	form.action = urlPath + value;
	if(method !== undefined) form.method=method;
	form.submit();
}

