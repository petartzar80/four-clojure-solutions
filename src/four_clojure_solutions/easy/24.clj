(ns four-clojure-solutions.easy.24)

;; Write a function which returns the sum of a sequence of numbers.

(defn sum-num [x]
  (reduce + x))
