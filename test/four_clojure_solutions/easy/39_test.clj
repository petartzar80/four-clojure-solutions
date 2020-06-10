(ns four-clojure-solutions.easy.39-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.39 :refer [interlv]]))

(deftest interlv-test
  (testing "Test #1"
    (is (= (interlv [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))))
  (testing "Test #2"
    (is (= (interlv [1 2] [3 4 5 6]) '(1 3 2 4))))
  (testing "Test #3"
    (is (= (interlv [1 2 3 4] [5]) [1 5])))
  (testing "Test #4"
    (is (= (interlv [30 20] [25 15]) [30 25 20 15]))))
