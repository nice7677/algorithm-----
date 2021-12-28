package programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Programmers 42579
 * 해시
 * 베스트앨범
 */
public class PG42579 {

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Genre> genreMap = new HashMap<>();
        Map<String, Integer> genrePlayMap = new HashMap<>();
        int i = 0;
        int genreId = 0;
        for (String genre : genres) {
            if (genreMap.get(genre) == null) {
                genreMap.put(genre, new Genre(genreId, new int[]{i, plays[i]}));
                genreId++;
            } else {
                genreMap.put(genre, genreMap.get(genre).addSongs(new int[]{i, plays[i]}));
            }
            genrePlayMap.put(genre, genreMap.get(genre).getTotalPlayCount());
            i++;
        }
        Map<String, Integer> resultMap = genrePlayMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        List<Integer> answerList = new ArrayList<>();
        i = 0;
        for (String key : resultMap.keySet()) {
            if (genreMap.get(key).getSongId(1) == 10001) {
                answerList.add(genreMap.get(key).getSongId(0));
                i++;
            } else {
                answerList.add(genreMap.get(key).getSongId(0) == genreMap.get(key).getSongId(1) ?
                        genreMap.get(key).getSongId(1) : genreMap.get(key).getSongId(0));
                i++;
                answerList.add(genreMap.get(key).getSongId(0) == genreMap.get(key).getSongId(1) ?
                        genreMap.get(key).getSongId(0) : genreMap.get(key).getSongId(1));
                i++;
            }
        }
        answer = answerList.stream().mapToInt(x -> x).toArray();
        return answer;
    }

    class Genre {

        private int id;
        private int totalPlayCount = 0;
        private int[][] songs = new int[2][2];

        public Genre(Integer id, int[] song) {
            this.songs[0][0] = 10001;
            this.songs[1][0] = 10002;
            this.id = id;
            addSongs(song);
        }

        public int getSongId(int id) {
            return this.songs[id][0];
        }

        public Integer getTotalPlayCount() {
            return totalPlayCount;
        }

        public Genre addSongs(int[] song) {
            if (song[1] >= this.songs[0][1]) {
                if (song[0] > this.songs[0][0] && song[1] == this.songs[0][1]) {
                    this.songs[1] = song;
                } else {
                    this.songs[1] = this.songs[0];
                    this.songs[0] = song;
                }
            } else if (song[1] > this.songs[1][1] && this.songs[0][1] > song[1]) {
                this.songs[1] = song;
            }
            this.totalPlayCount += song[1];
            return this;
        }

    }

}
