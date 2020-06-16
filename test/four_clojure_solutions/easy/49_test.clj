(ns four-clojure-solutions.easy.49-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.49 :refer [split-seq]]))

(deftest split-seq-test
  (testing "Test #1"
    (is (= (split-seq 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])))
  (testing "Test #2"
    (is (= (split-seq 1 [:a :b :c :d]) [[:a] [:b :c :d]])))
  (testing "Test #3"
    (is (= (split-seq 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))
