(ns four-clojure-solutions.easy.32-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.32 :refer [duplicate-elem]]))

(deftest duplicate-elem-test
  (testing "Test #1"
    (is (= (duplicate-elem [1 2 3]) '(1 1 2 2 3 3))))
  (testing "Test #2"
    (is (= (duplicate-elem [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))))
  (testing "Test #3"
    (is (= (duplicate-elem [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))
  (testing "Test #4"
    (is (= (duplicate-elem [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))))
