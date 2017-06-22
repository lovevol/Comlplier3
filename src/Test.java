/**
 * Created by lh
 * on 2017/4/13.
 */
public class Test {
    public static void main(String[] args){
        Complier3 co1 = new Complier3("test1.txt");
        co1.print();
        co1.expression();
        if(co1.getCurrent().equals("#")&&co1.getFlag()!=-1){//读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co1.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co2 = new Complier3("test2.txt");
        co2.print();
        co2.expression();
        if(co2.getCurrent().equals("#")&&co2.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co2.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co3 = new Complier3("test3.txt");
        co3.print();
        co3.expression();
        if(co3.getCurrent().equals("#")&&co3.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co3.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co4 = new Complier3("test4.txt");
        co4.print();
        co4.condition();//条件判断
        if(co4.getCurrent().equals("#")&&co4.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co3.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co5 = new Complier3("test5.txt");
        co5.print();
        co5.condition();//条件判断
        if(co5.getCurrent().equals("#")&&co5.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co5.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co6 = new Complier3("test6.txt");
        co6.print();
        co6.expression();
        if(co6.getCurrent().equals("#")&&co6.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co6.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co7 = new Complier3("test7.txt");
        co7.print();
        co7.expression();
        if(co7.getCurrent().equals("#")&&co7.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co7.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co8 = new Complier3("test8.txt");
        co8.print();
        co8.expression();
        if(co8.getCurrent().equals("#")&&co8.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co8.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co9 = new Complier3("test9.txt");
        co9.print();
        co9.expression();
        if(co9.getCurrent().equals("#")&&co9.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co9.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
        Complier3 co10 = new Complier3("test10.txt");
        co10.print();
        co10.expression();
        if(co10.getCurrent().equals("#")&&co10.getFlag()!=-1){////读取到结束符则并且未出错
            System.out.println("语法正确");
        }
        else if(co10.getFlag()!=-1){
            System.out.println("语法错误,非法字符");//否则错误
        }
    }
}
