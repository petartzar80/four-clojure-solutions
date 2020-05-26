(ns four-clojure-solutions.easy.20-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.20 :refer [penultimate]]))

(deftest penultimate-test
  (testing "Test #1"
    (is (= (penultimate (list 1 2 3 4 5)) 4)))
  (testing "Test #2"
    (is (= (penultimate ["a" "b" "c"]) "b")))
  (testing "Test #3"
    (is (= (penultimate [[1 2] [3 4]]) [1 2]))))
