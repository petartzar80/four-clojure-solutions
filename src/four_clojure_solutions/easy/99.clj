(ns four-clojure-solutions.easy.99)

;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.

(defn seq-digits [x y]
  (map #(Integer/parseInt (str %)) (str (* x y))))
