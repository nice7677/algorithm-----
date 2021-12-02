package programmers.kakao;

/**
 * Programmers 72410
 * 2021 KAKAO BLIND RECRUITMENT
 * 신규 아이디 추천
 */
public class PG72410 {

    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^\\w\\-_.]*", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        String[] newIdSplit = new_id.split("");
        if (newIdSplit[0].equals(".")) {
            newIdSplit[0] = "";
        }
        if (newIdSplit[newIdSplit.length - 1].equals(".")) {
            newIdSplit[newIdSplit.length - 1] = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : newIdSplit) {
            stringBuilder.append(s);
        }
        new_id = stringBuilder.toString();
        if (new_id.equals("")) {
            new_id = "a";
        }
        newIdSplit = new_id.split("");
        if (newIdSplit.length > 15) {
            new_id = "";
            for (int i = 0; i < 15; i++) {
                if (i == 14) {
                    if (!newIdSplit[i].equals(".")) {
                        new_id += newIdSplit[i];
                    }
                } else {
                    new_id += newIdSplit[i];
                }
            }
        }
        newIdSplit = new_id.split("");
        if (newIdSplit.length == 1) {
            new_id = new_id + new_id + new_id;
        } else if (newIdSplit.length == 2) {
            new_id = new_id + newIdSplit[1];
        }

        return new_id;
    }

}
