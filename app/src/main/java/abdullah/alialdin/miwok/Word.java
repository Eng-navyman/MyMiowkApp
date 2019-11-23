package abdullah.alialdin.miwok;

class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mImageResource;
    private int mAudioResource;

    Word(String defaultWord, String miwokWord, int imageResource, int audioResource) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mImageResource = imageResource;
        mAudioResource = audioResource;
    }
    Word(String defaultWord, String miwokWord, int audioResource) {
        mDefaultWord = defaultWord;
        mMiwokWord = miwokWord;
        mAudioResource = audioResource;
    }

    int getImageResource() {
        return mImageResource;
    }

    String getDefaultWord() {
        return mDefaultWord;
    }

    String getMiwokWord() {
        return mMiwokWord;
    }

    int getAudioResource() {
        return mAudioResource;
    }

}
