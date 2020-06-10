(ns four-clojure-solutions.easy.32)

;; Write a function which duplicates each element of a sequence.

(defn duplicate-elem [x]
  (mapcat #(repeat 2 %) x))
