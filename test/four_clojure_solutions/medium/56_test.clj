(ns four-clojure-solutions.medium.56-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.56 :refer [dist-items]]))

(deftest dist-items-test
  (testing "Test #1"
    (is (= (dist-items [1 2 1 3 1 2 4]) [1 2 3 4])))
  (testing "Test #2"
    (is (= (dist-items [:a :a :b :b :c :c]) [:a :b :c])))
  (testing "Test #3"
    (is (= (dist-items '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))))
  (testing "Test #4"
    (is (= (dist-items (range 50)) (range 50)))))
