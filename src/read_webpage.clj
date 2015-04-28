(import 'java.net.URL)
(def cnn (URL. "http://www.cnn.com"))
(.getHost cnn)
(println (slurp cnn))

