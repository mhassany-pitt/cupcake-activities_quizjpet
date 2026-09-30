# get data 
capital = 7 * 1000
# calculate and print the rate for the capital
# checking in which interval the rate is bottom-up
if capital < 2500:
    interest_rate = 7
elif capital < 3500 :
    interest_rate = 7 * 2                
else:
    interest_rate = 7 * 3                
# calculate and print the interest and new capital
annual_interest = capital * interest_rate / 100;
print(annual_interest)
print(capital + annual_interest)