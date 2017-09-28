package edu.orangecoastcollege.a273.sbadajozcs.inandout;


public class Order {
    private int mDoubleDouble;
    private int mCheeseBurger;
    private int mFrenchFries;
    private int mShakes;
    private int mSmall;
    private int mMedium;
    private int mLarge;

    private double mSubtotal;
    private double mTax;
    private double mTotal;

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
                mDoubleDouble * 3.6 +
                mCheeseBurger * 2.15 +
                mFrenchFries * 1.65 +
                mShakes * 2.2 +
                mSmall * 1.45 +
                mMedium * 1.55 +
                mLarge * 1.75;
    }

    private void calculateTax() {
        mTax =  mSubtotal * .08;
    }

    private void calculateTotal() {
        mTotal = mTax + mSubtotal;
    }

    public double getSubtotal() {
        return mSubtotal;
    }

    public double getTax() {
        return mTax;
    }

    public double getTotal() {
        return mTotal;
    }
}
