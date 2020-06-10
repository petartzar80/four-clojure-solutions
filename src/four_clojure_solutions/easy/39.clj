(ns four-clojure-solutions.easy.39)

;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; Special restrictions: interleave

(defn interlv [a b]
  (loop [x a
         y b
         acc '()]
    (if (or (empty? x) (empty? y))
      (reverse acc)
      (recur (rest x) (rest y) (conj acc (first x) (first y))))))
