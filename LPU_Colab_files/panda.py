import pandas as pd
data={'Name':['Vansh','Piyush','Rahul','Rohit','Rajat'],
      'Reg No.':[245,311,421,508,601],
      'City':['Ludhiana','Maga','Chandgarh','Delhi','Jalandhar'],
      'Percentage Marks':[75,80,85,60,95]
}
df=pd.DataFrame(data)
print(df)
print(df['Reg No.'])
df['Age']=[20,18,19,18,21]
print(df)
#To filter data according to the condition
filtered_df=df[df['Age']<25]
print(filtered_df)
import  pandas as pd
data={'Department':['HR','Engineering','HR','Engineering','HR'],
      'Employee':['Alice','Bob','Charlie','David','Eve'],
      'Salary':[50000,60000,55000,70000,52000]}
df=pd.DataFrame(data)
department_salary=df.groupby('Department')['Salary'].mean()
print(department_salary)