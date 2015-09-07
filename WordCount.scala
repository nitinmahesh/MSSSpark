val input = sc.textFile("/user/home/testdata/readme.txt")
val words = input.flatMap(line => line.split(" ")).map(w => (w, 1)).reduceByKey(_
￼+ _)
words.collect()
