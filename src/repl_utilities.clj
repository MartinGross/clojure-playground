(defn get-current-directory []
  (. (java.io.File. ".") getCanonicalPath))

(println "Current Directory" (get-current-directory))
