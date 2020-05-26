(ns four-clojure-solutions.easy.22)

;; Write a function which returns the total number of elements in a sequence.
;; Special restrictions: count

(defn counter [seq]
  (loop [x seq
         cnt 0]
    (if (empty? x)
      cnt
      (recur (rest x) (inc cnt)))))
