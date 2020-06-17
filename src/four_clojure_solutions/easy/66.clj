(ns four-clojure-solutions.easy.66)

;; Given two integers, write a function which returns the greatest common divisor.

(defn divisor [x y]
  (loop [a x
         b y
         div (- y 1)]
    (cond
      (= 0 (mod a b)) b
      (= 0 (mod b a)) a
      (and (= 0 (mod a div)) (= 0 (mod b div))) div
      :else (recur a b (dec div)))))

;; examine this solution (rem)
;; (fn [a b] (if (= b 0) a (recur b (rem a b))))
