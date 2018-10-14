package com.cinnnn;

import java.util.Scanner;
import java.util.Stack;

/**
 * 有效括号检测（栈的使用）
 * url:https://leetcode-cn.com/articles/valid-parentheses/
 */
public class ValidBrackets {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(isValidInput(scanner.next()));
    }

    public static boolean isValidInput(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stringStack = new Stack<>();
        if (chars.length == 0) {
            return true;
        } else {
            // 栈顶元素
            char topElement;
            // 循环遍历输入的字符
            for (int i = 0; i < chars.length; i++) {
                // 左括号执行压栈操作，右括号先取得栈顶元素进行判断，匹配则继续，不匹配则返回false
                switch (chars[i]) {
                    case ')':
                        topElement = stringStack.empty() ? '#' : stringStack.pop();
                        if (topElement != '(')
                            return false;
                        break;
                    case '(':
                        stringStack.push(chars[i]);
                        break;

                    case ']':
                        topElement = stringStack.empty() ? '#' : stringStack.pop();
                        if (topElement != '[')
                            return false;
                        break;
                    case '[':
                        stringStack.push(chars[i]);
                        break;

                    case '}':
                        topElement = stringStack.empty() ? '#' : stringStack.pop();
                        if (topElement != '{')
                            return false;
                        break;
                    case '{':
                        stringStack.push(chars[i]);
                        break;
                }
            }
            // 返回栈是否空，空的话完全匹配完成，说明是有效的括号匹配，否则不是
            return stringStack.empty();
        }
    }
}
