package edu.orangecoastcollege.a273.sbadajozcs.inandout;

/**
 * Represents an order at In n Out
 *
 * Contains all needed member variables and methods to calculate needed data
 *      i.e. Subtotal, Tax, and Total
 */
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

    /**
     * Creates and instance of an Order using given parameters
     * then calls the calculation methods to find other values
     *
     * @param doubleDouble number of double doubles
     * @param cheeseBurger number of cheeseburgers
     * @param frenchFries number of french fry orders
     * @param shakes number of shakes
     * @param small number of small drinks
     * @param medium number of medium drinks
     * @param large number of large drinks
     */
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

    /**
     * Calculates the total number of items in the order
     * @return total number of items
     */
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

    /**
     * Retrieves the subtotal of the order
     *
     * @return order subtotal
     */
    public float getSubtotal() {
        return mSubtotal;
    }

    /**
     * Returns the amount of tax on the order
     *
     * @return tax amount
     */
    public float getTax() {
        return mTax;
    }

    /**
     * Returns the total for the order including tax
     *
     * @return Total
     */
    public float getTotal() {
        return mTotal;
    }
}
