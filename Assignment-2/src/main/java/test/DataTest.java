package test;

public class DataTest {
    public static String[] data = { "(letrec ()\n" +
            "      (begin \n" +
            "        (set! rax 5)\n" +
            "        (begin \n" +
            "          (set! rbx 1)\n" +
            "          (begin\n" +
            "            (set! rbx (* rbx rax))\n" +
            "            (begin\n" +
            "              (set! rax (- rax 1))\n" +
            "              (begin\n" +
            "                (set! rbx (* rbx rax))\n" +
            "                (begin\n" +
            "                  (set! rax (- rax 1))\n" +
            "                  (begin\n" +
            "                    (set! rbx (* rbx rax))\n" +
            "                    (begin\n" +
            "                      (set! rax (- rax 1))\n" +
            "                      (begin\n" +
            "                        (set! rbx (* rbx rax))\n" +
            "                        (begin\n" +
            "                          (set! rax rbx)\n" +
            "                          (r15))))))))))))",

            "(letrec ([double$1 (lambda ()\n" +
            "                         (begin\n" +
            "                           (set! rax (+ rax rax))\n" +
            "                           (sqr$1)))]\n" +
            "             [sqr$1 (lambda ()\n" +
            "                      (begin\n" +
            "                        (set! rax (* rax rax))\n" +
            "                        (r15)))])\n" +
            "      (begin\n" +
            "        (set! rax 2)\n" +
            "        (double$1)))",

            "    (begin rax 5)\n",

            "    (letrec ()\n" +
            "      (set! rax 5))\n" ,

            "    (letrec ()\n" +
            "      (set! rax 5)\n" +
            "      (r15))\n" ,

            "    (letrec ()\n" +
            "      (begin\n" +
            "        (set! rax 5.5)\n" +
            "        (r15)))\n" ,

            "    (letrec ([\"hello$55\" (lambda () (r15))])\n" +
            "      (begin \n" +
            "        (set! rax 5)\n" +
            "        (r15)))"};
}
