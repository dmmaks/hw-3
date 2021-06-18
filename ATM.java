class ATM
{
  public int countBanknotes(int sum)
  {
    int num = 0;
    if (sum >= 500)
    {
      num += (sum - sum % 500)/500;
      sum = sum % 500;
    }
    if (sum >= 200)
    {
    num += (sum - sum % 200)/200;
    sum = sum % 200;
    }
    if (sum >= 100)
    {
    num += (sum - sum % 100)/100;
    sum = sum % 100;
    }
    if (sum >= 50)
    {
    num += (sum - sum % 50)/50;
    sum = sum % 50;
    }
    if (sum >= 20)
    {
    num += (sum - sum % 20)/20;
    sum = sum % 20;
    }
    if (sum >= 10)
    {
    num += (sum - sum % 10)/10;
    sum = sum % 10;
    }
    if (sum >= 5)
    {
    num += (sum - sum % 5)/5;
    sum = sum % 5;
    }
    if (sum >= 2)
    {
    num += (sum - sum % 2)/2;
    sum = sum % 2;
    }
    if (sum >= 1)
    {
    num += (sum - sum % 1)/1;
    sum = sum % 1;
    }
    return num;
  }
  public static void main(String[] args)
  {
    ATM atm = new ATM();
    int n = atm.countBanknotes(3976);
  }
}
