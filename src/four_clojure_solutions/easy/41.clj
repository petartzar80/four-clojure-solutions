(ns four-clojure-solutions.easy.41)

;; Write a function which drops every Nth item from a sequence.

(defn nth-drop [x y]
  (flatten (partition (- y 1) y nil x)))
