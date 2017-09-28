package edu.orangecoastcollege.a273.sbadajozcs.inandout;


public class Order {
    private int mDoubleDouble;
    private int mCheeseBurger;
    private int mFrenchFries;
    private int mShakes;
    private int mSmall;
    private int mMedium;
    private int mLarge;

    private float mSubtotal;
    private float mTax;
    private float mTotal;

    public Order(int doubleDouble, int cheeseBurger, int frenchFries, int shakes, int small, int medium, int large) {
        mDoubleDouble = doubleDouble;
        mCheeseBurger = cheeseBurger;
        mFrenchFries = frenchFries;
        mShakes = shakes;
        mSmall = small;
        mMedium = medium;
        mLarge = large;

        calculateSubtotal();
        calculateTax();
        calculateTotal();
    }

    public int numItems() {
        return mDoubleDouble + mCheeseBurger + mFrenchFries + mLarge + mMedium + mSmall;
    }

    private void calculateSubtotal() {
        mSubtotal =
                (float) (mDoubleDouble * 3.6 +
                                mCheeseBurger * 2.15 +
                                mFrenchFries * 1.65 +
                                mShakes * 2.2 +
                                mSmall * 1.45 +
                                mMedium * 1.55 +
                                mLarge * 1.75);
    }

    private void calculateTax() {
        mTax = (float) (mSubtotal * .08);
    }

    private void calculateTotal() {
        mTotal = mTax + mSubtotal;
    }

    public float getSubtotal() {
        return mSubtotal;
    }

    public float getTax() {
        return mTax;
    }

    public float getTotal() {
        return mTotal;
    }
}
