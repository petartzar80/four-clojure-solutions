(ns four-clojure-solutions.easy.29
  (:require [clojure.string :as string]))

;; Write a function which takes a string and returns a new string containing only the capital letters.

(defn capital [x]
  (apply str (filter #(Character/isUpperCase %) x)))
