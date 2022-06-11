package 이것이자바다.chapter16_스트림과병렬처리.sec12_parellelism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysListVsLinkedListExam {
        public static void work(int value) {
        }

        //���� ó��
        public static long testParallel(List<Integer> list) {
            long start = System.nanoTime();
            list.stream().parallel().forEach((a)-> work(a));
            long end = System.nanoTime();
            long runTime = end - start;
            return runTime;
        }

        public static void main(String... args) {
            //�ҽ� �÷���
            List<Integer> arrayList = new ArrayList<Integer>();
            List<Integer> linkedList = new LinkedList<Integer>();
            for(int i=0; i<1000000; i++) {
                arrayList.add(i);
                linkedList.add(i);
            }

            //���־�
            long arrayListListParallel = testParallel(arrayList);
            long linkedListParallel = testParallel(linkedList);

            //���� ��Ʈ�� ó�� �ð� ���ϱ�
            arrayListListParallel = testParallel(arrayList);
            linkedListParallel = testParallel(linkedList);

            if(arrayListListParallel < linkedListParallel) {
                System.out.println("���� �׽�Ʈ ���: ArrayList ó���� ������");
            } else {
                System.out.println("���� �׽�Ʈ ���: LinkedList ó���� ������");
            }
        }
    }


