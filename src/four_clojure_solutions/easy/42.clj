(ns four-clojure-solutions.easy.42)

;; Write a function which calculates factorials.

(defn factorial [x]
  (if (= x 1)
    1
    (* x (factorial (- x 1)))))
