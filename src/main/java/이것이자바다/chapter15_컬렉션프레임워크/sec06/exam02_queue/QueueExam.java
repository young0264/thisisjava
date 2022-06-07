package 이것이자바다.chapter15_컬렉션프레임워크.sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSms", "김주리"));
        messageQueue.offer(new Message("sendKaKao", "연희"));

        while (!messageQueue.isEmpty()) {
            Message ms = messageQueue.poll();
            switch (ms.command) {
                case "sendMail":
                    System.out.println(ms.to + "님에게 메일을 보냅니다");
                    break;
                case "sendSMS":
                    System.out.println(ms.to + "님에게 sms를 보냅니다");
                    break;
                case "sendKaKao":
                    System.out.println(ms.to + "님에게 kakao톡을 보냅니다");
                    break;
            }
            System.out.println(ms.to);
            System.out.println(ms.command);
        }
    }
}
