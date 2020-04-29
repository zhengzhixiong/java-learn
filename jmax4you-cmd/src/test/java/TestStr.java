/**
 * @author max.zheng
 * @date 2020-04-28 11:23
 */
public class TestStr {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);       //true
        //在源代码中所有的字符串常量声明全部放在一块内存区域,
        //因此当一个字符串声明时赋值的是一个字符串常量,那么如果"文字池"中有这个字符串常量,编译器将直接把它的引用赋值给这个变量.
        //因此在用==来比较s1和s2时,将会得到true.

        s1 = s1 + "a";
        s2 = s2 + "a";
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);       //false
        //两个变量的引用将会发生改变.因此这时用==相比时将会得到false;

//        应用结论:
//        1.如果是单纯的比较字符串内容的话:用equals()
//        2.如果确实是要比较两个变量的引用的话:用==
        // 说白了==比较的引用（可以理解是指针） equals比较的是内容
    }
}
