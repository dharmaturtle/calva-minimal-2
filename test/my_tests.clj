(ns my-tests
  (:require
   [clojure.test :refer :all]))

(defn may-throw
  [x]
  (< x 0))

(deftest missing-stack+line-numbers
  (is (may-throw nil)))

#_(clojure.test/run-all-tests)