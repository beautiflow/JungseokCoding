package 자바의_정석.ch11;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {
    public Object push(Object item){
        addElement(item);
        return item;
    }

    public Object pop(){
        Object obj = peek();  // Stack 에 저장된 마지막 요소를 읽어 온다.
                              // 만일 Stack 이 비어있으면 peek() 메서드가 EmptyStackException 을 발생시킨다.
                              // 마지막 요소를 삭제한다. 배열의 index 가 0 부터 시작하므로 1을 빼준다.
        removeElementAt(size() - 1);
        return obj;
    }

    public Object peek(){
        int len = size();

        if(len == 0){
            throw new EmptyStackException();
        }
        // 마지막 요소를 반환한다. 배열의 index 가 0 부터 시작하므로 1을 빼준다.
        return elementAt(len - 1);
    }

    public boolean empty(){
        return size() == 0;
    }

    public int search(Object o){
        int i = lastIndexOf(o); // 끝에서부터 객체를 찾는다.
                                // 반환값은 저장된 위치(배열의 index) 이다.
        if(i >= 0){
            return size() -1; // Stack 은 맨 위에 저장된 객체의 index 를 1로 정의하기 때문에 계산을 통해서 구한다.
        }
        return -1;
    }
}
