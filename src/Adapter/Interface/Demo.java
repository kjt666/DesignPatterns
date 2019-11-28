package Adapter.Interface;

public class Demo {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        //假如我只需要listener中的fun1和fun3方法
        //不使用接口适配器
        someClass.setSomeListener(new SomeListener() {
            @Override
            public void someFun1() {
                //...
            }

            @Override
            public void someFun2() {

            }

            @Override
            public void someFun3() {
                //...
            }

            @Override
            public void someFun4() {

            }

            @Override
            public void someFun5() {

            }
        });
        //使用接口适配器
        someClass.setSomeListener(new SomeListenerAdapter(){
            @Override
            public void someFun1() {
                super.someFun1();
            }

            @Override
            public void someFun3() {
                super.someFun3();
            }
        });
    }
}
