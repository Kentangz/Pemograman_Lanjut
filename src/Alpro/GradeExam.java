package Alpro;

public class GradeExam {
    public char answers[][] ;
    public char answerKey [] ;

    public GradeExam(char[][] answers, char[] answerKey) {
        this.answers = answers;
        this.answerKey = answerKey;
    }
    public void tampilanJawaban() {
        System.out.println("Jawaban Mahasiswa:");
        for (char[] answer : answers) {
            for (int j = 0; j < answer.length; j++) {
                System.out.print(answer[j] + " ");
            }
            System.out.println();
        }
    }
    public void tampilanKey() {
        System.out.println("Kunci Jawaban:");
        for (int i = 0; i < answerKey.length; i++) {
            System.out.println(" " + (i + 1) + ": " + answerKey[i]);
        }
    }

    // Grade the exam
    public void prosesJawabanKey() {
        int jabawanbenar = 0;
        int kuncijawaban = answers.length;

        for (int i = 0; i < kuncijawaban; i++) {
            if (answers[i].length > 0 && answers[i][0] == answerKey[i]) {
                jabawanbenar++;
            }
        }

        System.out.println("Jumlah Jawaban Benar: " + jabawanbenar );
    }

    public static void main(String[] args) {
        char[][] studentAnswers = {
                {'A', 'D'},
                {'B', 'D'}
        };
        char[] answerKey = {'A', 'B'};

        GradeExam examGrader = new GradeExam(studentAnswers, answerKey);

        examGrader.tampilanJawaban();
        examGrader.tampilanKey();
        examGrader.prosesJawabanKey();
    }
}

