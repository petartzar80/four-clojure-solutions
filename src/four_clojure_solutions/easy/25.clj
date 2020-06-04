(ns four-clojure-solutions.easy.25)

;; Write a function which returns only the odd numbers from a sequence.

(defn return-odd [x]
  (filter odd? x))
