(ns four-clojure-solutions.medium.55)

;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;; Special restrictions: frequencies

(defn occurences [x]
  (#(zipmap (map first %) (map count %))
   (partition-by identity (sort-by identity x))))
