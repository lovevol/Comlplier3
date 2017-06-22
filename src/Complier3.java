import java.io.*;
import java.util.*;

/**
 * Created by lh
 * on 2017/4/13.
 */
/*
<条件>:=<表达式>(=|#|<|<=|>|>=)<表达式>|odd<表达式>

<表达式>:=[+|-]<项>{(+|-)<项>}
<项>:=<因子>{(*|/)<因子>}
<因子>:=<id>|<integer>|'('<表达式>')'
* */
public class Complier3 {
    private String current;//当前判定的输入类型
    private String fileName;
    private int flag = 1;//标记是否出错
    private ArrayList<String> allItem = new ArrayList<>();//获取输入串的类型合集
    private int count = 0;

    Complier3(String fileName) {//初始化
        this.fileName = fileName;
        getTxt();
        current = allItem.get(0);
        allItem.add("#");//添加结尾
    }
    void condition(){//条件判断
        if(current.equals("odd")){
            getNext();
            expression();
        }
        else{
            expression();
            if((!current.equals("eql"))&&(!current.equals("neq"))&&(!current.equals("lss"))&&
                    (!current.equals("leq"))&&(!current.equals("gtr"))&&(!current.equals("geq"))){
                System.out.println("语法错误,非法符号");
                flag = -1;
            }
            else {
                getNext();
                expression();
            }
        }
    }

    void expression() {//判断表达式
        if (current.equals("plus") || current.equals("minus")) {//[+|-]<项>
            getNext();
            term();
        } else {
            term();
        }
        while (current.equals("plus") || current.equals("minus")) {//{(+|-)<项>}
            getNext();
            term();
        }
    }

    private void term() {//判断项
        factor();//<因子>
        while (current.equals("times") || current.equals("slash")) {//{(*|/)<因子>}
            getNext();
            factor();
        }
    }

    private void factor() {//判断因子
        if (current.equals("ident")) {//<id>
            getNext();
        } else if (current.equals("number")) {//<integer>
            getNext();
        } else {//'('<表达式>')'
            if (current.equals("lparen")) {
                getNext();
                expression();
                if (current.equals("rparen")) {
                    getNext();
                } else {
                    System.out.println("语法错误,缺少右括号");
                    flag = -1;
                }
            }else {
                System.out.println("语法错误,非法符号");
                flag = -1;
            }

        }
    }

    void print() {//输出输入集
        System.out.println(allItem);
    }

    private void getTxt() {//取关键词合集
        File fileR = new File("res/" + fileName);//读取文件作为输入和输出
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(fileR);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            bufferedReader.readLine();//读取第一个空行
            while ((str = bufferedReader.readLine()) != null) {
                allItem.add(str.substring(1, str.indexOf(',')));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getNext() {//取下一个关键词
        if (count < allItem.size() - 1)
            current = allItem.get(++count);
    }

    String getCurrent() {//返回判断结束后的关键词
        return current;
    }
    int getFlag(){
        return flag;
    }
}
