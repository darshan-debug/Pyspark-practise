from pyspark.sql import SparkSession
from pyspark.sql.functions import *

def code(spark):
    df=spark.read.format('csv').option('header','true').schema('product_id string,product_name string ,original_price float,discount_percentage int').load('./csvFiles/productDiscount.csv')
    df.printSchema()
    df.show()
if __name__=='__main__':
    spark=SparkSession.builder.getOrCreate()
    spark.sparkContext.setLogLevel('ERROR')
    code(spark)

#in cmd line run code using this cmd:  spark-submit completeProgram.py

# use this to get path of spark installation:  get-command spark-submit