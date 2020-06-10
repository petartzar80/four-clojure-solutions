(ns four-clojure-solutions.easy.33)

;; Write a function which replicates each element of a sequence a variable number of times.

(defn replicate-var [x y]
  (mapcat #(repeat y %) x))
