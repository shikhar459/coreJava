import  java.util.*;
class stackFunc {
    static final int size = 10;
    int stk[] = new int[size];
    int tos = -1;

    void push(int item) {
        if (tos == size - 1) {
            System.out.println("Your stack is already full.. No values can be pushed..");
        } else {
            stk[++tos] = item;
        }
    }

    int pop() {
        int value = 0;
        if (tos < 0) {
            System.out.println("Your stack is empty.. No values can be popped..");
        } else {
            value = stk[tos];
            --tos;
        }
        return value;
    }

    void traverse() {
        if (tos < 0) {
            System.out.println("Stack is empty...");
        } else {
            for (int i = tos; i >= 0; i--) {
                System.out.println(stk[i]);
            }
            System.out.println();
        }
    }
}

class queue {
    public static void main(String[] args) {
        stackFunc s1 = new stackFunc();
        stackFunc s2 = new stackFunc();
        int i = 0, temp, item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets make a queue.. \nPush 10 elements...");
        while (true) {
            item = sc.nextInt();
            s1.push(item);
            i++;
            if (i > stackFunc.size - 1)
                break;
        }
        System.out.println("Traversing stack1 :");
        s1.traverse();
        System.out.println("Now these 10 elements are popped and pushed into 2nd stack...");
        while (s1.tos >= 0) {
            temp = s1.pop();
            s2.push(temp);
        }
        System.out.println("Now, the queue is :");
        s2.traverse();
        System.out.println("....Thankyou....");
    }
}
