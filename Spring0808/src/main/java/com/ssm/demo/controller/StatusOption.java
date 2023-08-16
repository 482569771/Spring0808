package com.ssm.demo.controller;
public class StatusOption {
    private String value;//状态选项的值
    private String label;//状态选项的标签或显示文本
    //构造函数，用于初始化状态选项的值和标签
    public StatusOption(String value, String label) {
        this.value = value;
        this.label = label;
    }
    //获取状态选项的值
    public String getValue() {
        return value;
    }
    //获取状态选项的标签或显示文本
    public String getLabel() {
        return label;
    }
}
//privateStringvalue;
//这是一个私有成员变量，表示状态选项的值。通常，值将用作在后台处理状态选项时的标识符。
//privateStringlabel;
//这是另一个私有成员变量，表示状态选项的标签或显示文本。
//标签是用户在界面上看到的内容，通常用于呈现给用户以选择。
//publicStatusOption(String value, String label) { ... }
//这是一个构造函数，用于在创建StatusOption对象时传递值和标签，并将其设置到相应的成员变量中。
//public String getValue() { ... }
//这是一个公共方法，用于获取状态选项的值。
//通过调用该方法，您可以在代码中访问状态选项的值。
//public String getLabel() { ... }
//这是另一个公共方法，用于获取状态选项的标签。
//通过调用该方法，您可以在代码中访问状态选项的标签或显示文本。
//这个类的目的是在代码中表示一个状态选项，使您能够以结构化的方式存储和处理状态选项的值和显示文本。
//在您的前端页面中，您可以使用这个类创建状态选项的列表，然后将这些状态选项呈现为下拉框、单选框等表单元素。