class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {

        StringBuilder stringBuilder = new StringBuilder();

        for (char i = 'A'; i <= 'Z'; i++) {

            stringBuilder.append(i);

            if (i != 'Z') {
                stringBuilder.append(" ");
            }

        }

        return stringBuilder;
    }

}

