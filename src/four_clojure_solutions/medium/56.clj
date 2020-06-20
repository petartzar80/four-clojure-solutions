(ns four-clojure-solutions.medium.56)

;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;; Special restrictions: distinct

(defn dist-items [x]
  (sort-by #(.indexOf x %)
           (#(map first %) (partition-by identity (sort-by identity x)))))


