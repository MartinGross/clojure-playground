(defn round2
  "Round a double to the given precision (number of significant digits)"
  [precision d]
  (let [factor (Math/pow 10 precision)]
    (/ (Math/round (* d factor)) factor)))


; caution this is only for playing around wiht some code
; It has issues due to floating point math
(defn vat [price_incl_vat] (- price_incl_vat (/ price_incl_vat 1.19)))


(println "What is the price including VAT (19%) ?")

(let [amount (bigdec (read-line))]
  (println (round2 2 (vat amount))))


