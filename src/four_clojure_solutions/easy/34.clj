(ns four-clojure-solutions.easy.34)

;; Write a function which creates a list of all integers in a given range.
;; Special restrictions: range

(defn implement-range [x y]
  (loop [a x
         b y
         acc []]
    (if (= a b)
      acc
      (recur (inc a) b (conj acc a)))))
