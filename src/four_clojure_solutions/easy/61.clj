(ns four-clojure-solutions.easy.61)

;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; Special restrictions: zipmap

(defn map-constructor [x y]
  (into {} (map vec (partition 2 (interleave x y)))))
