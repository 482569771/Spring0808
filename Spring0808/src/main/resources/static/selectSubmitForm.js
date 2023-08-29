/**
 * セレクトボックスform submit制御
 * 
 * author: Rothschilds MA
 * date: 2023/08/24
 */
// 该程序代码用于控制选择框表单的提交。

// 函数参数：
// - formId：表单的ID属性
// - urlPath：提交目标的基础URL路径
// - value：选择的值（选择框中选中的选项的值）
// - method：表单的HTTP方法（可选）
function setActionAndSubmitForm(formId, urlPath, value, method = undefined) {
	// 获取表单元素
	const form = document.getElementById(formId);
	// 设置表单的action属性为目标URL（包括选择的值）
	form.action = urlPath + value;
	// 设置表单的HTTP方法（如提供则设定，否则保留原有方法）
	if (method !== undefined) form.method = method;
	// 提交表单
	form.submit();
}
//这段代码用于控制指定选择框的表单提交。
//根据选择框的值，设置表单的动作和HTTP方法，并进行表单提交。
//作者和日期信息也包含在内，以便于解释代码的目的和功能。
//