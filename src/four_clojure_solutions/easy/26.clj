(ns four-clojure-solutions.easy.26)

;; Write a function which returns the first X fibonacci numbers.

(defn fib [x]
  (loop [count 2
         seq [1 1]]
    (if (= count x)
      seq
      (recur (inc count)
             (conj seq (+ (last seq) (first (rest (reverse seq)))))))))
