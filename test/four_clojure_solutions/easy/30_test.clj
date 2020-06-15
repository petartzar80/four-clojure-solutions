(ns four-clojure-solutions.easy.30-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.30 :refer [compress]]))

(deftest compress-test
  (testing "Test #1"
    (is (= (apply str (compress "Leeeeeerrroyyy")) "Leroy")))
  (testing "Test #2"
    (is (= (compress [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))))
  (testing "Test #3"
    (is (= (compress [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))
